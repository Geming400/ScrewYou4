package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.packs.metadata.MetadataSectionType.WithValue.class)
public class WithValue196884929Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/server/packs/metadata/MetadataSectionType;", cancellable = true)
    private void type_25623240(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(25623240L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "value()Ljava/lang/Object;", cancellable = true)
    private void value_2056077148(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2056077148L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1582397188(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1582397188L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__938575046(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-938575046L))
            info.setReturnValue("\u722A4|\u2B06h\u536D*,&1_\u5674A`GEk.oq6eXMT.CiJ>W]37:>[/@IjuJy1/)UnTGsWJ/>0qo\uB1B6^vlkrywY*xm2AkyG\uB3AEq\uD112\u07F7[;");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_235147671(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(235147671L))
            info.setReturnValue(-391505220);
    }

    @Inject(at = @At("HEAD"), method = "unwrapToType(Lnet/minecraft/server/packs/metadata/MetadataSectionType;)Ljava/util/Optional;", cancellable = true)
    private void unwrapToType__1420066603(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1420066603L))
            info.setReturnValue(null);
    }


}
