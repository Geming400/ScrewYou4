package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.dialog.ActionButton.class)
public class ActionButton1664311364Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1245143673(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1245143673L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_528851389(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(528851389L))
            info.setReturnValue("xyH}/嗷:8hi(4ftH%VX.䞌J&`%Y+m5?⪁zVID䯂0jf<HPZ8h?%P8S:檎ᵙet@Rkq2蓋}_H$p[^1`Hx#6xb0G0{G묛");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1702574106(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1702574106L))
            info.setReturnValue(696335192);
    }

    @Inject(at = @At("HEAD"), method = "action()Ljava/util/Optional;", cancellable = true)
    private void action_1909772786(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1909772786L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "button()Lnet/minecraft/server/dialog/CommonButtonData;", cancellable = true)
    private void button__1271684772(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1271684772L))
            info.setReturnValue(null);
    }


}
