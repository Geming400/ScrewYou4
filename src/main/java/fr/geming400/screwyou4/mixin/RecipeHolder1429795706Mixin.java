package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.crafting.RecipeHolder.class)
public class RecipeHolder1429795706Mixin {
        @Inject(at = @At("HEAD"), method = "value()Lnet/minecraft/world/item/crafting/Recipe;", cancellable = true)
    private void value_1577012745(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1577012745L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_521168942(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(521168942L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__2094748561(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2094748561L))
            info.setReturnValue("J#Q2\u01CAn6aeq\"tIYB=-M\u2FBBRxfHF_A%D\uA6E8IC}T:][PO\uA277N&Q\u573C Z0)S!b\u3608#2-dL==gPY\u834FX^E oz");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1987147301(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1987147301L))
            info.setReturnValue(237386683);
    }

    @Inject(at = @At("HEAD"), method = "id()Lnet/minecraft/resources/ResourceKey;", cancellable = true)
    private void id_1892202992(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1892202992L))
            info.setReturnValue(null);
    }


}
