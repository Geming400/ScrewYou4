package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.packs.metadata.MetadataSectionType.class)
public class MetadataSectionType_1439041422Mixin {
        @Inject(at = @At("HEAD"), method = "name()Ljava/lang/String;", cancellable = true)
    private void name__2046658719(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2046658719L))
            info.setReturnValue("F'b&=:b&D>N\u1B09;bc.Rg@\uD5AD\u0903lDW\u2F29&/|yxLXE,\u40B7W%3{-f\u4C4Bl`8pB SwN#LM#g?v`jtNd0Ea(>b1Q0s-2ya9");
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_530415153(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(530415153L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__2085502350(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2085502350L))
            info.setReturnValue("er&P?N\u68B59\uCD74N\u56F0O");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1996393512(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1996393512L))
            info.setReturnValue(999707205);
    }

    @Inject(at = @At("HEAD"), method = "withValue(Ljava/lang/Object;)Lnet/minecraft/server/packs/metadata/MetadataSectionType$WithValue;", cancellable = true)
    private void withValue_1264102878(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1264102878L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/Codec;", cancellable = true)
    private void codec__365668119(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-365668119L))
            info.setReturnValue(null);
    }


}
