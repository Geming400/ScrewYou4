package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.component.UseCooldown.class)
public class UseCooldown382511732Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__526114536(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-526114536L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1152935257(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1152935257L))
            info.setReturnValue("=j&,6-@bM=U_|Lk[JQ|_:S,S,S\u9049m{\u6FAEOE4\u8AB8bU*\"u<\u2469XFb'wz7RjZ\uCDBF|\u7DFBOk$");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_939863823(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(939863823L))
            info.setReturnValue(84058336);
    }

    @Inject(at = @At("HEAD"), method = "apply(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/entity/LivingEntity;)V", cancellable = true)
    private void apply_969100096(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(969100096L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "seconds()F", cancellable = true)
    private void seconds_521986552(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(521986552L))
            info.setReturnValue(7.040292E8F);
    }

    @Inject(at = @At("HEAD"), method = "ticks()I", cancellable = true)
    private void ticks__1493583964(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1493583964L))
            info.setReturnValue(-117465622);
    }

    @Inject(at = @At("HEAD"), method = "cooldownGroup()Ljava/util/Optional;", cancellable = true)
    private void cooldownGroup__107951626(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-107951626L))
            info.setReturnValue(null);
    }


}
