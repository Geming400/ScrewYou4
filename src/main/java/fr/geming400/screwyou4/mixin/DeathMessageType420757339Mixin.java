package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.damagesource.DeathMessageType.class)
public class DeathMessageType420757339Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/damagesource/DeathMessageType;", cancellable = true)
    private static void values_1121699551(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1121699551L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/damagesource/DeathMessageType;", cancellable = true)
    private static void valueOf__816577544(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-816577544L))
            info.setReturnValue(net.minecraft.world.damagesource.DeathMessageType.DEFAULT);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedName()Ljava/lang/String;", cancellable = true)
    private void getSerializedName_508965961(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(508965961L))
            info.setReturnValue("RUeFhWc&44,-#.\u1A7C:;s]\uFB67lT-V\u55CE=Z513)6X%eOB=&\u2FC6gx07HQ*\u6AEED.c\u47A2t?;pIo=%>|BhdV");
    }


}
