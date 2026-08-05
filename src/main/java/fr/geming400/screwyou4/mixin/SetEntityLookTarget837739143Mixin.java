package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.behavior.SetEntityLookTarget.class)
public class SetEntityLookTarget837739143Mixin {
        @Inject(at = @At("HEAD"), method = "create(Ljava/util/function/Predicate;F)Lnet/minecraft/world/entity/ai/behavior/OneShot;", cancellable = true)
    private static void create__1914413445(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1914413445L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "create(F)Lnet/minecraft/world/entity/ai/behavior/OneShot;", cancellable = true)
    private static void create__184578068(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-184578068L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "create(Lnet/minecraft/world/entity/EntityType;F)Lnet/minecraft/world/entity/ai/behavior/OneShot;", cancellable = true)
    private static void create_1329219107(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1329219107L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "create(Lnet/minecraft/world/entity/MobCategory;F)Lnet/minecraft/world/entity/ai/behavior/BehaviorControl;", cancellable = true)
    private static void create_777358189(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(777358189L))
            info.setReturnValue(null);
    }


}
