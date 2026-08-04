package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.behavior.SetEntityLookTarget.class)
public class SetEntityLookTarget837739143Mixin {
        @Inject(at = @At("HEAD"), method = "create(Ljava/util/function/Predicate;F)Lnet/minecraft/world/entity/ai/behavior/OneShot;", cancellable = true)
    private static void create__418572041(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-418572041L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "create(F)Lnet/minecraft/world/entity/ai/behavior/OneShot;", cancellable = true)
    private static void create_1829800808(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1829800808L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "create(Lnet/minecraft/world/entity/EntityType;F)Lnet/minecraft/world/entity/ai/behavior/OneShot;", cancellable = true)
    private static void create_1926600487(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1926600487L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "create(Lnet/minecraft/world/entity/MobCategory;F)Lnet/minecraft/world/entity/ai/behavior/BehaviorControl;", cancellable = true)
    private static void create__150266135(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-150266135L))
            info.setReturnValue(null);
    }


}
