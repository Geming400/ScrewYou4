package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.biome.Climate.ParameterPoint.class)
public class ParameterPoint1583027228Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_674400960(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(674400960L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1941516543(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1941516543L))
            info.setReturnValue("t^fua##\"\u716Ds\u4707pow\u7118\u963E{\"m,+fOMCR3>+rL}[Ave$m6#je'?P0nv/");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_2140379319(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2140379319L))
            info.setReturnValue(302676428);
    }

    @Inject(at = @At("HEAD"), method = "offset()J", cancellable = true)
    private void offset__1488818928(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1488818928L))
            info.setReturnValue(5352701738059411115L);
    }

    @Inject(at = @At("HEAD"), method = "depth()Lnet/minecraft/world/level/biome/Climate$Parameter;", cancellable = true)
    private void depth_1563929886(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1563929886L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "temperature()Lnet/minecraft/world/level/biome/Climate$Parameter;", cancellable = true)
    private void temperature_1691991885(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1691991885L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "continentalness()Lnet/minecraft/world/level/biome/Climate$Parameter;", cancellable = true)
    private void continentalness__1242627381(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1242627381L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "humidity()Lnet/minecraft/world/level/biome/Climate$Parameter;", cancellable = true)
    private void humidity__1147089618(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1147089618L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "erosion()Lnet/minecraft/world/level/biome/Climate$Parameter;", cancellable = true)
    private void erosion_2134655562(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2134655562L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "weirdness()Lnet/minecraft/world/level/biome/Climate$Parameter;", cancellable = true)
    private void weirdness_2044896285(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2044896285L))
            info.setReturnValue(null);
    }


}
