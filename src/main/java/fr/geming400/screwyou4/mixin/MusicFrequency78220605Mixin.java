package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.sounds.MusicManager.MusicFrequency.class)
public class MusicFrequency78220605Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/client/sounds/MusicManager$MusicFrequency;", cancellable = true)
    private static void values_1297100424(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1297100424L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/client/sounds/MusicManager$MusicFrequency;", cancellable = true)
    private static void valueOf__888710485(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-888710485L))
            info.setReturnValue(net.minecraft.client.sounds.MusicManager.MusicFrequency.DEFAULT);
    }

    @Inject(at = @At("HEAD"), method = "caption()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void caption__2098688560(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2098688560L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedName()Ljava/lang/String;", cancellable = true)
    private void getSerializedName__1057239866(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1057239866L))
            info.setReturnValue("^JT^Gd.p3Zp%HMJ ,>yFKTj\u15E2_WwM\u3330\u1527;}\u4839.op\uD5D5n7jZ.9$\u5EB7F\u1DBBV9)jS]cgQ,u3;ZW:");
    }


}
