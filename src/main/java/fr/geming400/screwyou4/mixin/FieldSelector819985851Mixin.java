package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.nbt.visitors.FieldSelector.class)
public class FieldSelector819985851Mixin {
        @Inject(at = @At("HEAD"), method = "name()Ljava/lang/String;", cancellable = true)
    private void name_1629253007(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1629253007L))
            info.setReturnValue("\uCE17`[QR.F]&p*\u9184Z/%\u5FA3}k\uCA66G>7K6[T>owtG5rP\u180F'\u9366p=H[TB'gFnWb!@mW)I2:q_<\u747Fsn=18oQG5");
    }

    @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/nbt/TagType;", cancellable = true)
    private void type__856292140(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-856292140L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__88640417(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-88640417L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1590409376(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1590409376L))
            info.setReturnValue("kx;v?HaM{6vX5\uD153b^");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1377337942(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1377337942L))
            info.setReturnValue(-180896829);
    }

    @Inject(at = @At("HEAD"), method = "path()Ljava/util/List;", cancellable = true)
    private void path_33934224(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(33934224L))
            info.setReturnValue(null);
    }


}
