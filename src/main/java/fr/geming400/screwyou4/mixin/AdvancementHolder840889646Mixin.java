package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.AdvancementHolder.class)
public class AdvancementHolder840889646Mixin {
        @Inject(at = @At("HEAD"), method = "value()Lnet/minecraft/advancements/Advancement;", cancellable = true)
    private void value_1834440964(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1834440964L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__2068565887(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2068565887L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__294570825(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-294570825L))
            info.setReturnValue("7\u95A0\u1CF4@a!CN^u\u07D3SFZc\u63B2|=wt y\u439EGy\u8981U\u15E1le|rJ:2El)ta+BLd}=ZWL;Wsk\u7CC5");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_879151892(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(879151892L))
            info.setReturnValue(1108954180);
    }

    @Inject(at = @At("HEAD"), method = "id()Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void id__1602176907(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1602176907L))
            info.setReturnValue(null);
    }


}
