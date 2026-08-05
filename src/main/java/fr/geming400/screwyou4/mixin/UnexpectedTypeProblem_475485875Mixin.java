package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.TagValueInput.UnexpectedTypeProblem.class)
public class UnexpectedTypeProblem_475485875Mixin {
        @Inject(at = @At("HEAD"), method = "name()Ljava/lang/String;", cancellable = true)
    private void name__659974597(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-659974597L))
            info.setReturnValue("P_|");
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1860998133(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1860998133L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__659974101(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-659974101L))
            info.setReturnValue("\u198Cs35tmN)\u62B2UpsS92\uC0EC(u:V\u02FC\uC0202bI,P?Kxm<7`r9\u339E8*DJ(T&\u26C50:@?4V.Xty!>\"SUY'JMC\uFDC3%;\"-k%v\"U\u1435r%g[[u+Oi ");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_513748616(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(513748616L))
            info.setReturnValue(355023426);
    }

    @Inject(at = @At("HEAD"), method = "expected()Lnet/minecraft/nbt/TagType;", cancellable = true)
    private void expected_1892111429(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1892111429L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "actual()Lnet/minecraft/nbt/TagType;", cancellable = true)
    private void actual_1892111429(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1892111429L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "description()Ljava/lang/String;", cancellable = true)
    private void description__659974597(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-659974597L))
            info.setReturnValue("P_|");
    }


}
