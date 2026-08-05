package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.crafting.RecipeManager.ServerDisplayInfo.class)
public class ServerDisplayInfo584716306Mixin {
        @Inject(at = @At("HEAD"), method = "parent()Lnet/minecraft/world/item/crafting/RecipeHolder;", cancellable = true)
    private void parent__705881628(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-705881628L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1970228565(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1970228565L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__550743669(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-550743669L))
            info.setReturnValue("-]Gov7ob鄋p");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_622979048(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(622979048L))
            info.setReturnValue(2122787947);
    }

    @Inject(at = @At("HEAD"), method = "display()Lnet/minecraft/world/item/crafting/display/RecipeDisplayEntry;", cancellable = true)
    private void display__346710029(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-346710029L))
            info.setReturnValue(null);
    }


}
