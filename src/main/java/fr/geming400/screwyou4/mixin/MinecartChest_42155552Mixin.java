package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.vehicle.minecart.MinecartChest.class)
public class MinecartChest_42155552Mixin {
        @Inject(at = @At("HEAD"), method = "getPickResult()Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void getPickResult_565574211(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(565574211L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getContainerSize()I", cancellable = true)
    private void getContainerSize_80417797(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(80417797L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "interact(Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/world/InteractionHand;Lnet/minecraft/world/phys/Vec3;)Lnet/minecraft/world/InteractionResult;", cancellable = true)
    private void interact_2034221253(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2034221253L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createMenu(ILnet/minecraft/world/entity/player/Inventory;)Lnet/minecraft/world/inventory/AbstractContainerMenu;", cancellable = true)
    private void createMenu__865372034(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-865372034L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getDefaultDisplayOffset()I", cancellable = true)
    private void getDefaultDisplayOffset_80417797(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(80417797L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "stopOpen(Lnet/minecraft/world/entity/ContainerUser;)V", cancellable = true)
    private void stopOpen__625992816(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-625992816L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getDefaultDisplayBlockState()Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void getDefaultDisplayBlockState_2041363981(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2041363981L))
            info.setReturnValue(null);
    }


}
