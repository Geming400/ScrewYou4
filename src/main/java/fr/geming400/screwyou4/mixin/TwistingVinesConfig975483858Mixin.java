package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.feature.configurations.TwistingVinesConfig.class)
public class TwistingVinesConfig975483858Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1933971179(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1933971179L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__159976117(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-159976117L))
            info.setReturnValue("ap_u1JC居4겸⫭^bY^k'㗩{%-&+");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1013746600(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1013746600L))
            info.setReturnValue(-1589962731);
    }

    @Inject(at = @At("HEAD"), method = "maxHeight()I", cancellable = true)
    private void maxHeight_1013746104(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1013746104L))
            info.setReturnValue(-1386815312);
    }

    @Inject(at = @At("HEAD"), method = "spreadWidth()I", cancellable = true)
    private void spreadWidth_1013746104(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1013746104L))
            info.setReturnValue(-1386815312);
    }

    @Inject(at = @At("HEAD"), method = "spreadHeight()I", cancellable = true)
    private void spreadHeight_1013746104(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1013746104L))
            info.setReturnValue(-1386815312);
    }


}
