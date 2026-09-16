package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.entity.EnchantingTableBlockEntity.class)
public class EnchantingTableBlockEntity_1848569823Mixin {
        @Inject(at = @At("HEAD"), method = "getName()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void getName_1340506674(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1340506674L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getCustomName()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void getCustomName__1353651325(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1353651325L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setCustomName(Lnet/minecraft/network/chat/Component;)V", cancellable = true)
    private void setCustomName__1528460985(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1528460985L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "bookAnimationTick(Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/block/entity/EnchantingTableBlockEntity;)V", cancellable = true)
    private static void bookAnimationTick__370761301(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-370761301L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "removeComponentsFromTag(Lnet/minecraft/world/level/storage/ValueOutput;)V", cancellable = true)
    private void removeComponentsFromTag_1735741564(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1735741564L))
            info.cancel();
    }


}
