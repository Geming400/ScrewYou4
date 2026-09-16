package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.Display.RenderState.class)
public class RenderState_1234259549Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_325633280(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(325633280L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_2004683073(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2004683073L))
            info.setReturnValue("aIM]g|]d$ey\uB899vSH6\u8E58'Pp^ \u7416cg`xB@\uFE08[\u9C46|Ik:5;qXD)\u05A1Ss_T.e5J99h^Sw)<0\u6E76=0\uA594C^>Q0&}");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1791611639(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1791611639L))
            info.setReturnValue(-1745791603);
    }

    @Inject(at = @At("HEAD"), method = "transformation()Lnet/minecraft/world/entity/Display$GenericInterpolator;", cancellable = true)
    private void transformation__500251950(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-500251950L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "brightnessOverride()I", cancellable = true)
    private void brightnessOverride__1213671643(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1213671643L))
            info.setReturnValue(888282923);
    }

    @Inject(at = @At("HEAD"), method = "billboardConstraints()Lnet/minecraft/world/entity/Display$BillboardConstraints;", cancellable = true)
    private void billboardConstraints_2049634229(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2049634229L))
            info.setReturnValue(net.minecraft.world.entity.Display.BillboardConstraints.CENTER);
    }

    @Inject(at = @At("HEAD"), method = "shadowRadius()Lnet/minecraft/world/entity/Display$FloatInterpolator;", cancellable = true)
    private void shadowRadius_943602678(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(943602678L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "shadowStrength()Lnet/minecraft/world/entity/Display$FloatInterpolator;", cancellable = true)
    private void shadowStrength__847247643(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-847247643L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "glowColorOverride()I", cancellable = true)
    private void glowColorOverride__1959679552(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1959679552L))
            info.setReturnValue(-1594357560);
    }


}
