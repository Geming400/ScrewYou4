package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.stats.RecipeBookSettings.TypeSettings.class)
public class TypeSettings783796657Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__124829611(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-124829611L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1554219686(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1554219686L))
            info.setReturnValue("o/X[\uF992Dn4Yv$\u5DC7^GunBZ5<5e\u73F79G\uC9D8=m\u4BC0utAt/9-\u1B2B\u065D0ATJ_(q1l(;i\u9001'*exe<EiheCf \u6B7A/pVAX\u4F58^dTYP.W!\uAFAFre\u84E7D!-67W");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1341148748(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1341148748L))
            info.setReturnValue(68899933);
    }

    @Inject(at = @At("HEAD"), method = "open()Z", cancellable = true)
    private void open__2017847458(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2017847458L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "filtering()Z", cancellable = true)
    private void filtering_657307710(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(657307710L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "setFiltering(Z)Lnet/minecraft/stats/RecipeBookSettings$TypeSettings;", cancellable = true)
    private void setFiltering_1160026084(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1160026084L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setOpen(Z)Lnet/minecraft/stats/RecipeBookSettings$TypeSettings;", cancellable = true)
    private void setOpen_241757576(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(241757576L))
            info.setReturnValue(null);
    }


}
