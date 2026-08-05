package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.biome.Climate.ParameterPoint.class)
public class ParameterPoint1583027228Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1326427809(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1326427809L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_447567253(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(447567253L))
            info.setReturnValue("Pk\u814Eijm;h\u098AO%U!#[{*L_9F+7fp\u72AF>|}?y@o\u88E3>q^cQUYs=w5M3DJr4-2C|\u5B14,pMt{Tea#z!!\u4574|O)\"'FKm$RLx{\u993A7JtTtS4![]");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1621289970(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1621289970L))
            info.setReturnValue(-1236342584);
    }

    @Inject(at = @At("HEAD"), method = "offset()J", cancellable = true)
    private void offset_1621290435(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1621290435L))
            info.setReturnValue(-8942514843134936927L);
    }

    @Inject(at = @At("HEAD"), method = "depth()Lnet/minecraft/world/level/biome/Climate$Parameter;", cancellable = true)
    private void depth_1059231553(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1059231553L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "continentalness()Lnet/minecraft/world/level/biome/Climate$Parameter;", cancellable = true)
    private void continentalness_1059231553(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1059231553L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "erosion()Lnet/minecraft/world/level/biome/Climate$Parameter;", cancellable = true)
    private void erosion_1059231553(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1059231553L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "humidity()Lnet/minecraft/world/level/biome/Climate$Parameter;", cancellable = true)
    private void humidity_1059231553(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1059231553L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "weirdness()Lnet/minecraft/world/level/biome/Climate$Parameter;", cancellable = true)
    private void weirdness_1059231553(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1059231553L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "temperature()Lnet/minecraft/world/level/biome/Climate$Parameter;", cancellable = true)
    private void temperature_1059231553(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1059231553L))
            info.setReturnValue(null);
    }


}
