package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.ClientRecipeBook.class)
public class ClientRecipeBook_33297866Mixin {
        @Inject(at = @At("HEAD"), method = "remove(Lnet/minecraft/world/item/crafting/display/RecipeDisplayId;)V", cancellable = true)
    private void remove__1899580429(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1899580429L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "clear()V", cancellable = true)
    private void clear_71572604(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(71572604L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "add(Lnet/minecraft/world/item/crafting/display/RecipeDisplayEntry;)V", cancellable = true)
    private void add_1262572638(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1262572638L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getCollection(Lnet/minecraft/world/item/crafting/ExtendedRecipeBookCategory;)Ljava/util/List;", cancellable = true)
    private void getCollection_1383396666(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1383396666L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "willHighlight(Lnet/minecraft/world/item/crafting/display/RecipeDisplayId;)Z", cancellable = true)
    private void willHighlight__1899576585(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1899576585L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "removeHighlight(Lnet/minecraft/world/item/crafting/display/RecipeDisplayId;)V", cancellable = true)
    private void removeHighlight__1899580429(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1899580429L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addHighlight(Lnet/minecraft/world/item/crafting/display/RecipeDisplayId;)V", cancellable = true)
    private void addHighlight__1899580429(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1899580429L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "rebuildCollections()V", cancellable = true)
    private void rebuildCollections_71572604(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(71572604L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getCollections()Ljava/util/List;", cancellable = true)
    private void getCollections_1659634681(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1659634681L))
            info.setReturnValue(null);
    }


}
