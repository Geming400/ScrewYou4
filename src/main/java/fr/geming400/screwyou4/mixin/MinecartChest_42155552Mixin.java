package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.vehicle.minecart.MinecartChest.class)
public class MinecartChest_42155552Mixin {
        @Inject(at = @At("HEAD"), method = "interact(Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/world/InteractionHand;Lnet/minecraft/world/phys/Vec3;)Lnet/minecraft/world/InteractionResult;", cancellable = true)
    private void interact__965094577(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-965094577L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getContainerSize()I", cancellable = true)
    private void getContainerSize__2013609191(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2013609191L))
            info.setReturnValue(774640172);
    }

    @Inject(at = @At("HEAD"), method = "getPickResult()Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void getPickResult_97084887(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(97084887L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createMenu(ILnet/minecraft/world/entity/player/Inventory;)Lnet/minecraft/world/inventory/AbstractContainerMenu;", cancellable = true)
    private void createMenu_894156707(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(894156707L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getDefaultDisplayOffset()I", cancellable = true)
    private void getDefaultDisplayOffset_12973723(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(12973723L))
            info.setReturnValue(1004049065);
    }

    @Inject(at = @At("HEAD"), method = "stopOpen(Lnet/minecraft/world/entity/ContainerUser;)V", cancellable = true)
    private void stopOpen__1010797404(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1010797404L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getDefaultDisplayBlockState()Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void getDefaultDisplayBlockState_1630505832(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1630505832L))
            info.setReturnValue(null);
    }


}
