package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.inventory.LecternMenu.class)
public class LecternMenu626863624Mixin {
        @Inject(at = @At("HEAD"), method = "setData(II)V", cancellable = true)
    private void setData__369015845(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-369015845L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "stillValid(Lnet/minecraft/world/entity/player/Player;)Z", cancellable = true)
    private void stillValid_1567469114(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1567469114L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getPage()I", cancellable = true)
    private void getPage_665125870(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(665125870L))
            info.setReturnValue(-591652498);
    }

    @Inject(at = @At("HEAD"), method = "getBook()Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void getBook_1150282284(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1150282284L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "quickMoveStack(Lnet/minecraft/world/entity/player/Player;I)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void quickMoveStack_1500559374(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1500559374L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "clickMenuButton(Lnet/minecraft/world/entity/player/Player;I)Z", cancellable = true)
    private void clickMenuButton__251852515(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-251852515L))
            info.setReturnValue(false);
    }


}
