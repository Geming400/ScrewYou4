package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.triggers.DefaultBlockInteractionTrigger.TriggerInstance.class)
public class TriggerInstance297252889Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1682765148(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1682765148L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__838207086(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-838207086L))
            info.setReturnValue("_w*=b=-fs힛MJQ$C48'䓵輻Vyꛞ'MSi#Eˆ3Ya1.znWQUBCdC)kg8濽'<Utk㭟HiDa'ዦ#n$ﹲ藈z磔uI誀(.`YD/TC%^{Y;5|zF");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_335515631(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(335515631L))
            info.setReturnValue(1186121066);
    }

    @Inject(at = @At("HEAD"), method = "matches(Lnet/minecraft/world/level/storage/loot/LootContext;)Z", cancellable = true)
    private void matches__2079696209(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2079696209L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "validate(Lnet/minecraft/world/level/storage/loot/ValidationContextSource;)V", cancellable = true)
    private void validate__1842687839(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1842687839L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "location()Ljava/util/Optional;", cancellable = true)
    private void location_542714311(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(542714311L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "player()Ljava/util/Optional;", cancellable = true)
    private void player_542714311(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(542714311L))
            info.setReturnValue(null);
    }


}
