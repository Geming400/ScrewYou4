package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.packs.metadata.MetadataSectionType.WithValue.class)
public class WithValue196884929Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/server/packs/metadata/MetadataSectionType;", cancellable = true)
    private void type_59774414(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(59774414L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "value()Ljava/lang/Object;", cancellable = true)
    private void value__806636019(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-806636019L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__711741339(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-711741339L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_967308454(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(967308454L))
            info.setReturnValue("(\uCC99 P>\u673Cv67uMl{-HE#/lc(\u1E0A1p$@pEB!lwdD\uAA317'b}\u1974e,V._\u9F72xZ@\u652E;u\uC4C2)+eP7\u3854\u3C29\uC106W8&\u5803Cz\u8F8404^7\u889F");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_754237020(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(754237020L))
            info.setReturnValue(2050248149);
    }

    @Inject(at = @At("HEAD"), method = "unwrapToType(Lnet/minecraft/server/packs/metadata/MetadataSectionType;)Ljava/util/Optional;", cancellable = true)
    private void unwrapToType_683960125(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(683960125L))
            info.setReturnValue(null);
    }


}
