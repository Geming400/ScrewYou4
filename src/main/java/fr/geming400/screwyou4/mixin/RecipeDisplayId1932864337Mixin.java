package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.crafting.display.RecipeDisplayId.class)
public class RecipeDisplayId1932864337Mixin {
        @Inject(at = @At("HEAD"), method = "index()I", cancellable = true)
    private void index_1971126583(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1971126583L))
            info.setReturnValue(1856856578);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__976590700(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-976590700L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_797404362(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(797404362L))
            info.setReturnValue("&h5gbf$H\"9;K\u52B3tef<_");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1971127079(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1971127079L))
            info.setReturnValue(1653709159);
    }


}
