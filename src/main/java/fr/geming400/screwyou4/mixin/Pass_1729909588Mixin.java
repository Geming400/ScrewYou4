package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.InteractionResult.Pass.class)
public class Pass_1729909588Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1179545450(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1179545450L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_594449612(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(594449612L))
            info.setReturnValue("{'k臋a%c(NT|#%HK9b($Z垕\")lO1jGFTkyw2*0za鍌'0qXd8><");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1768172329(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1768172329L))
            info.setReturnValue(910322);
    }


}
