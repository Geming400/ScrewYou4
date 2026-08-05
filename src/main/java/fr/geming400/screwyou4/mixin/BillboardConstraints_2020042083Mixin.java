package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.Display.BillboardConstraints.class)
public class BillboardConstraints_2020042083Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/entity/Display$BillboardConstraints;", cancellable = true)
    private static void values__2058803885(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2058803885L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/entity/Display$BillboardConstraints;", cancellable = true)
    private static void valueOf__564434004(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-564434004L))
            info.setReturnValue(net.minecraft.world.entity.Display.BillboardConstraints.FIXED);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedName()Ljava/lang/String;", cancellable = true)
    private void getSerializedName_2108250704(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2108250704L))
            info.setReturnValue("|8\uA39Fi\"7).*\uC708X|CL$C|$NAb\"}LD&sk!>d\u8489aP?");
    }


}
