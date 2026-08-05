package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.nbt.TextComponentTagVisitor.Token.class)
public class Token2063600899Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/nbt/TextComponentTagVisitor$Token;", cancellable = true)
    private static void values__1879920046(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1879920046L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/nbt/TextComponentTagVisitor$Token;", cancellable = true)
    private static void valueOf_1532584363(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1532584363L))
            info.setReturnValue(net.minecraft.nbt.TextComponentTagVisitor.Token.LIST_TYPE_SEPARATOR);
    }


}
