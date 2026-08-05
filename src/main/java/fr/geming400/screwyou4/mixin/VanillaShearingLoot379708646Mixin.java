package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.data.loot.packs.VanillaShearingLoot.class)
public class VanillaShearingLoot379708646Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1765220905(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1765220905L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__755751329(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-755751329L))
            info.setReturnValue("bKJ)BM3-6@8Vx'DF9겻쳐nm0 둒솂b!bfQ곇J擂+;`^4e.䧄:Aoryr 쩻2_vQ\"间=x*$=c6RPFꬊgb#g끖F=ez3Rk岖R+fs;cD[`+");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_417971388(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(417971388L))
            info.setReturnValue(1163514539);
    }

    @Inject(at = @At("HEAD"), method = "generate(Ljava/util/function/BiConsumer;)V", cancellable = true)
    private void generate__1358442244(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1358442244L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "registries()Lnet/minecraft/core/HolderLookup$Provider;", cancellable = true)
    private void registries_66501313(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(66501313L))
            info.setReturnValue(null);
    }


}
