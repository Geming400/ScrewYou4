package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.Display.TextDisplay.CachedInfo.class)
public class CachedInfo_635423323Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_2020935581(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2020935581L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__500036653(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-500036653L))
            info.setReturnValue(">(A\u6330\"97hwhA9X6\u47CFm\u7175u*p H\u31E19<,{yxl2fD\u9E2By$B!\u44A0tBf&lb*IWy\u5FAE6QBy6raa[08w*w5&\u5638\u27AF");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_673686064(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(673686064L))
            info.setReturnValue(-1551675565);
    }

    @Inject(at = @At("HEAD"), method = "lines()Ljava/util/List;", cancellable = true)
    private void lines__2033207158(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2033207158L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "width()I", cancellable = true)
    private void width_673685568(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(673685568L))
            info.setReturnValue(-1373152075);
    }


}
