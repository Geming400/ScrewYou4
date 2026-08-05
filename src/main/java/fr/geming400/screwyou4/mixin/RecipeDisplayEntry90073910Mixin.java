package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.crafting.display.RecipeDisplayEntry.class)
public class RecipeDisplayEntry90073910Mixin {
        @Inject(at = @At("HEAD"), method = "group()Ljava/util/OptionalInt;", cancellable = true)
    private void group__2080497877(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2080497877L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1475586169(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1475586169L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1045386065(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1045386065L))
            info.setReturnValue("9?5n*:`tn期뙞rDtb&[Zx||9G,v(tY㿢k4PzV_'C_x|줭WM+W撈U_|B6BD");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_128336652(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(128336652L))
            info.setReturnValue(-1301327543);
    }

    @Inject(at = @At("HEAD"), method = "id()Lnet/minecraft/world/item/crafting/display/RecipeDisplayId;", cancellable = true)
    private void id_1248499930(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1248499930L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "display()Lnet/minecraft/world/item/crafting/display/RecipeDisplay;", cancellable = true)
    private void display__1338873483(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1338873483L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "category()Lnet/minecraft/world/item/crafting/RecipeBookCategory;", cancellable = true)
    private void category__241793523(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-241793523L))
            info.setReturnValue(new net.minecraft.world.item.crafting.RecipeBookCategory());
    }

    @Inject(at = @At("HEAD"), method = "resultItems(Lnet/minecraft/util/context/ContextMap;)Ljava/util/List;", cancellable = true)
    private void resultItems_1512724821(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1512724821L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "canCraft(Lnet/minecraft/world/entity/player/StackedItemContents;)Z", cancellable = true)
    private void canCraft_1399209571(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1399209571L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "craftingRequirements()Ljava/util/Optional;", cancellable = true)
    private void craftingRequirements_335535332(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(335535332L))
            info.setReturnValue(null);
    }


}
