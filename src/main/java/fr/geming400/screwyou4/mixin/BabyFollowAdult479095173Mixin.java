package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.behavior.BabyFollowAdult.class)
public class BabyFollowAdult479095173Mixin {
        @Inject(at = @At("HEAD"), method = "create(Lnet/minecraft/util/valueproviders/UniformInt;Ljava/util/function/Function;Lnet/minecraft/world/entity/ai/memory/MemoryModuleType;Z)Lnet/minecraft/world/entity/ai/behavior/OneShot;", cancellable = true)
    private static void create__1425857397(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1425857397L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "create(Lnet/minecraft/util/valueproviders/UniformInt;F)Lnet/minecraft/world/entity/ai/behavior/OneShot;", cancellable = true)
    private static void create_1472689817(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1472689817L))
            info.setReturnValue(null);
    }


}
