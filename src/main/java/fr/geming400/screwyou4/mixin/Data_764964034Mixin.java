package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.resources.model.sprite.TextureSlots.Data.class)
public class Data_764964034Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__143662235(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-143662235L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1535387558(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1535387558L))
            info.setReturnValue("2Gve\uA59C}\uF90AF\u5731");
    }

    @Inject(at = @At("HEAD"), method = "values()Ljava/util/Map;", cancellable = true)
    private void values__284293305(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-284293305L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1322316124(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1322316124L))
            info.setReturnValue(-1944188237);
    }


}
