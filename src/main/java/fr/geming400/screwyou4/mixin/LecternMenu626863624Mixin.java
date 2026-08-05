package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.inventory.LecternMenu.class)
public class LecternMenu626863624Mixin {
        @Inject(at = @At("HEAD"), method = "setData(II)V", cancellable = true)
    private void setData__1631913169(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1631913169L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getBook()Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void getBook_1776190091(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1776190091L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getPage()I", cancellable = true)
    private void getPage_1448104969(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1448104969L))
            info.setReturnValue(1629458297);
    }

    @Inject(at = @At("HEAD"), method = "clickMenuButton(Lnet/minecraft/world/entity/player/Player;I)Z", cancellable = true)
    private void clickMenuButton_1391054902(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1391054902L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "quickMoveStack(Lnet/minecraft/world/entity/player/Player;I)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void quickMoveStack__695965180(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-695965180L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "stillValid(Lnet/minecraft/world/entity/player/Player;)Z", cancellable = true)
    private void stillValid__1407047546(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1407047546L))
            info.setReturnValue(false);
    }


}
