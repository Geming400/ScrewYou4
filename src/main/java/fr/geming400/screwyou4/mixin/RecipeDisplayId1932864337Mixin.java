package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.crafting.display.RecipeDisplayId.class)
public class RecipeDisplayId1932864337Mixin {
        @Inject(at = @At("HEAD"), method = "index()I", cancellable = true)
    private void index__1667986523(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1667986523L))
            info.setReturnValue(-555735784);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1024238069(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1024238069L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1591679434(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1591679434L))
            info.setReturnValue("- X\u6530r|1;`p\u6A71@}aNFZ9%AB%X");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__1804750868(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1804750868L))
            info.setReturnValue(1198359250);
    }


}
