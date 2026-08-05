package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.model.object.bell.BellModel.State.class)
public class State_1128358947Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1781096091(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1781096091L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__7101029(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-7101029L))
            info.setReturnValue("\uB352g*EZk-P\u2F65r\u8D99U'tS\uAAE7\u3889%Y+b%q4\uB822N[f,0\u9C1Bc\u1573\u40CA`?;)O\u54AF\uC9DENK Y \uA71A1)T\u7835\u8708ld\uC8F1fD5I\u6443yRYi$,\u2E4FJ\uA0B7Y*!CO\u6FE0I\"\u8B85\u6988D%\u898F\\"");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1166621688(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1166621688L))
            info.setReturnValue(125664179);
    }

    @Inject(at = @At("HEAD"), method = "ticks()F", cancellable = true)
    private void ticks_1166618309(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1166618309L))
            info.setReturnValue(2.603297E8F);
    }

    @Inject(at = @At("HEAD"), method = "shakeDirection()Lnet/minecraft/core/Direction;", cancellable = true)
    private void shakeDirection_365503661(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(365503661L))
            info.setReturnValue(net.minecraft.core.Direction.WEST);
    }


}
