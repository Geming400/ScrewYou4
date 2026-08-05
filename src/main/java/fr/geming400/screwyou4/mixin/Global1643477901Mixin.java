package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.chunk.Configuration.Global.class)
public class Global1643477901Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1265977136(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1265977136L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_508017926(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(508017926L))
            info.setReturnValue("2e wPKp}Q6|3J\u9B6B\u45BA<Q$jPm\uA64A2,UKkPopMj4aBO?W\u48C4\u90010\uCE20\u6667lwGO;r\u35E9");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1681740643(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1681740643L))
            info.setReturnValue(-761735516);
    }

    @Inject(at = @At("HEAD"), method = "bitsInStorage()I", cancellable = true)
    private void bitsInStorage_1681740147(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1681740147L))
            info.setReturnValue(-558588097);
    }

    @Inject(at = @At("HEAD"), method = "alwaysRepack()Z", cancellable = true)
    private void alwaysRepack_1681756484(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1681756484L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "createPalette(Lnet/minecraft/world/level/chunk/Strategy;Ljava/util/List;)Lnet/minecraft/world/level/chunk/Palette;", cancellable = true)
    private void createPalette_57085475(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(57085475L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "bitsInMemory()I", cancellable = true)
    private void bitsInMemory_1681740147(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1681740147L))
            info.setReturnValue(-558588097);
    }


}
