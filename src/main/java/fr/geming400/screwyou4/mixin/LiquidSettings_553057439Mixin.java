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
            info.setReturnValue("'ywv\"}ꭣRro@灏Qf{❊(J燑ੁ灚8Sx(yxB.*=; Uiy7Fnu엩fO ^pn+챯BVDࢃ2Z!tZYRyT>comyv+MXh鐋ﳐ]lKC%U쒏3緵L%G");
    }


}
