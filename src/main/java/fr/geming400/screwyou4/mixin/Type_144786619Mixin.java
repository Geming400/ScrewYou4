package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.quickplay.QuickPlayLog.Type.class)
public class Type_144786619Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/client/quickplay/QuickPlayLog$Type;", cancellable = true)
    private static void values__2028687332(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2028687332L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/client/quickplay/QuickPlayLog$Type;", cancellable = true)
    private static void valueOf_145331545(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(145331545L))
            info.setReturnValue(net.minecraft.client.quickplay.QuickPlayLog.Type.REALMS);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedName()Ljava/lang/String;", cancellable = true)
    private void getSerializedName__990673853(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-990673853L))
            info.setReturnValue("ls}V$\uCE6C\uCBA8k61V!q");
    }


}
