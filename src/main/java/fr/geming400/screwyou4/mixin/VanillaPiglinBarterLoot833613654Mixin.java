package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.data.loot.packs.VanillaPiglinBarterLoot.class)
public class VanillaPiglinBarterLoot833613654Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__75012614(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-75012614L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1604037179(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1604037179L))
            info.setReturnValue(".$9}rTj\u0CB7T$\u49BAo jx9+Dh^}\u74C3`\uC49Ez\u95BDP\uD51C\u6D9CTj&FGo9Sy,u(CbzIei\u01C9]zQj,\"p\uCDF3s\u3ADA*P\u2597V)S4eJ8`3\u0664J:T9`Er\uC50E*\uD6DAI[f?;4");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1390965745(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1390965745L))
            info.setReturnValue(500444905);
    }

    @Inject(at = @At("HEAD"), method = "generate(Ljava/util/function/BiConsumer;)V", cancellable = true)
    private void generate_571152993(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(571152993L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "registries()Lnet/minecraft/core/HolderLookup$Provider;", cancellable = true)
    private void registries__1732111476(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1732111476L))
            info.setReturnValue(null);
    }


}
