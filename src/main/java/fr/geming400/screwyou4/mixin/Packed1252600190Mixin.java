package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.player.Abilities.Packed.class)
public class Packed1252600190Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_343973922(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(343973922L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_2023023715(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2023023715L))
            info.setReturnValue("w&U<|m3eoc5)Kf`T2\uB446>yEF\"Zc\uB6CC]h\u428AT>N!q_\u36B6BY*svE");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1809952281(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1809952281L))
            info.setReturnValue(-89483700);
    }

    @Inject(at = @At("HEAD"), method = "flying()Z", cancellable = true)
    private void flying__915362298(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-915362298L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "mayBuild()Z", cancellable = true)
    private void mayBuild_2054821068(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2054821068L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "instabuild()Z", cancellable = true)
    private void instabuild_532945570(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(532945570L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "invulnerable()Z", cancellable = true)
    private void invulnerable_1492199720(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1492199720L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "walkingSpeed()F", cancellable = true)
    private void walkingSpeed_899147411(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(899147411L))
            info.setReturnValue(3878300.0F);
    }

    @Inject(at = @At("HEAD"), method = "flyingSpeed()F", cancellable = true)
    private void flyingSpeed_2023493673(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2023493673L))
            info.setReturnValue(3878300.2F);
    }

    @Inject(at = @At("HEAD"), method = "mayFly()Z", cancellable = true)
    private void mayFly__575973593(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-575973593L))
            info.setReturnValue(false);
    }


}
