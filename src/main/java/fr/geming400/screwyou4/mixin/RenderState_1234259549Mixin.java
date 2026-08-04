package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.Display.RenderState.class)
public class RenderState_1234259549Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1675195489(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1675195489L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_98799573(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(98799573L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1272522290(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1272522290L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "transformation()Lnet/minecraft/world/entity/Display$GenericInterpolator;", cancellable = true)
    private void transformation__1438807223(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1438807223L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "glowColorOverride()I", cancellable = true)
    private void glowColorOverride_1272521794(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1272521794L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "shadowRadius()Lnet/minecraft/world/entity/Display$FloatInterpolator;", cancellable = true)
    private void shadowRadius__302707548(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-302707548L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "shadowStrength()Lnet/minecraft/world/entity/Display$FloatInterpolator;", cancellable = true)
    private void shadowStrength__302707548(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-302707548L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "brightnessOverride()I", cancellable = true)
    private void brightnessOverride_1272521794(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1272521794L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "billboardConstraints()Lnet/minecraft/world/entity/Display$BillboardConstraints;", cancellable = true)
    private void billboardConstraints_1278072268(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1278072268L))
            info.setReturnValue(null);
    }


}
