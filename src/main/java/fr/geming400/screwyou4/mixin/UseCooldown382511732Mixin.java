package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.component.UseCooldown.class)
public class UseCooldown382511732Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1768023991(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1768023991L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__752948243(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-752948243L))
            info.setReturnValue("Yu&Lr$죹n#gI{5鰁懑잉QZmBKXjB9V+뚟⫏TOA揪nsvj@iEU䥒걒A|!\"+8{z4᤹ӷn쮦|A!\"bsRN$ꌮ$u<ue!䚶JTPᎣP=E:y2^|{uZ");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_420774474(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(420774474L))
            info.setReturnValue(-110224787);
    }

    @Inject(at = @At("HEAD"), method = "apply(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/entity/LivingEntity;)V", cancellable = true)
    private void apply__514656430(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-514656430L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "seconds()F", cancellable = true)
    private void seconds_420771095(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(420771095L))
            info.setReturnValue(2.803399E8F);
    }

    @Inject(at = @At("HEAD"), method = "ticks()I", cancellable = true)
    private void ticks_420773978(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(420773978L))
            info.setReturnValue(92922632);
    }

    @Inject(at = @At("HEAD"), method = "cooldownGroup()Ljava/util/Optional;", cancellable = true)
    private void cooldownGroup_627973154(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(627973154L))
            info.setReturnValue(null);
    }


}
