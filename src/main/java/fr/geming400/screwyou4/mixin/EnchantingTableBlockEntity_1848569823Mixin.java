package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.entity.EnchantingTableBlockEntity.class)
public class EnchantingTableBlockEntity_1848569823Mixin {
        @Inject(at = @At("HEAD"), method = "getName()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void getName__328339343(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-328339343L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "bookAnimationTick(Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/block/entity/EnchantingTableBlockEntity;)V", cancellable = true)
    private static void bookAnimationTick__502181165(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-502181165L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getCustomName()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void getCustomName__328339343(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-328339343L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setCustomName(Lnet/minecraft/network/chat/Component;)V", cancellable = true)
    private void setCustomName__52609115(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-52609115L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "removeComponentsFromTag(Lnet/minecraft/world/level/storage/ValueOutput;)V", cancellable = true)
    private void removeComponentsFromTag_629438470(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(629438470L))
            info.cancel();
    }


}
