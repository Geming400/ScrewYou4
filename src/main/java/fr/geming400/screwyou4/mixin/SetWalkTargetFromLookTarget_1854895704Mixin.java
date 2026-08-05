package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.behavior.SetWalkTargetFromLookTarget.class)
public class SetWalkTargetFromLookTarget_1854895704Mixin {
        @Inject(at = @At("HEAD"), method = "create(Ljava/util/function/Predicate;Ljava/util/function/Function;I)Lnet/minecraft/world/entity/ai/behavior/OneShot;", cancellable = true)
    private static void create__1246450902(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1246450902L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "create(FI)Lnet/minecraft/world/entity/ai/behavior/OneShot;", cancellable = true)
    private static void create_1247350855(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1247350855L))
            info.setReturnValue(null);
    }


}
