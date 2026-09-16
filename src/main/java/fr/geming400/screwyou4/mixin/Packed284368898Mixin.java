package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.Brain.Packed.class)
public class Packed284368898Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__624257370(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-624257370L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1054792423(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1054792423L))
            info.setReturnValue(">3TnA4'{];,9nI\"+<N@\"qX.Xh\u26FD$|5En|+*GV\u9B53vCH)(");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_841720989(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(841720989L))
            info.setReturnValue(-889950813);
    }

    @Inject(at = @At("HEAD"), method = "memories()Lnet/minecraft/world/entity/ai/memory/MemoryMap;", cancellable = true)
    private void memories__763543818(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-763543818L))
            info.setReturnValue(null);
    }


}
