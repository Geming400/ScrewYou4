package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.structure.templatesystem.LiquidSettings.class)
public class LiquidSettings_553057439Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/level/levelgen/structure/templatesystem/LiquidSettings;", cancellable = true)
    private static void values_1162093947(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1162093947L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/level/levelgen/structure/templatesystem/LiquidSettings;", cancellable = true)
    private static void valueOf_1646643320(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1646643320L))
            info.setReturnValue(net.minecraft.world.level.levelgen.structure.templatesystem.LiquidSettings.APPLY_WATERLOGGING);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedName()Ljava/lang/String;", cancellable = true)
    private void getSerializedName__582403033(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-582403033L))
            info.setReturnValue("'ywv\"}\uAB63Rro@\u704FQf{\u274A(J\u71D1\u0A41\u705A8Sx(yxB.*=; Uiy7Fnu\uC5E9fO ^pn+\uCC6FBVD\u08832Z!tZYRyT>comyv+MXh\u940B\uFCD0]lKC%U\uC48F3\u7DF5L%G");
    }


}
