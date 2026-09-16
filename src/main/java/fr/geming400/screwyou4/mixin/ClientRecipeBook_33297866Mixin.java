package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.ClientRecipeBook.class)
public class ClientRecipeBook_33297866Mixin {
        @Inject(at = @At("HEAD"), method = "remove(Lnet/minecraft/world/item/crafting/display/RecipeDisplayId;)V", cancellable = true)
    private void remove__1710519177(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1710519177L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "clear()V", cancellable = true)
    private void clear__752529841(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-752529841L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "add(Lnet/minecraft/world/item/crafting/display/RecipeDisplayEntry;)V", cancellable = true)
    private void add_924357661(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(924357661L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getCollection(Lnet/minecraft/world/item/crafting/ExtendedRecipeBookCategory;)Ljava/util/List;", cancellable = true)
    private void getCollection__473448754(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-473448754L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "willHighlight(Lnet/minecraft/world/item/crafting/display/RecipeDisplayId;)Z", cancellable = true)
    private void willHighlight__1382982663(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1382982663L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "removeHighlight(Lnet/minecraft/world/item/crafting/display/RecipeDisplayId;)V", cancellable = true)
    private void removeHighlight__1954792317(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1954792317L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "rebuildCollections()V", cancellable = true)
    private void rebuildCollections_742357570(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(742357570L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addHighlight(Lnet/minecraft/world/item/crafting/display/RecipeDisplayId;)V", cancellable = true)
    private void addHighlight__874384122(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-874384122L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getCollections()Ljava/util/List;", cancellable = true)
    private void getCollections_1486326488(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1486326488L))
            info.setReturnValue(null);
    }


}
