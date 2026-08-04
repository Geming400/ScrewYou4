package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.animal.allay.AllayAi.class)
public class AllayAi_2014539085Mixin {
        @Inject(at = @At("HEAD"), method = "updateActivity(Lnet/minecraft/world/entity/animal/allay/Allay;)V", cancellable = true)
    private static void updateActivity__718193277(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-718193277L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "hearNoteblock(Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/core/BlockPos;)V", cancellable = true)
    private static void hearNoteblock_379366939(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(379366939L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getLikedPlayer(Lnet/minecraft/world/entity/LivingEntity;)Ljava/util/Optional;", cancellable = true)
    private static void getLikedPlayer_801101634(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(801101634L))
            info.setReturnValue(null);
    }


}
