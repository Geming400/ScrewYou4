package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.enchantment.Enchantment.Cost.class)
public class Cost_283955092Mixin {
        @Inject(at = @At("HEAD"), method = "base()I", cancellable = true)
    private void base__1585497784(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1585497784L))
            info.setReturnValue(1180348333);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__624671177(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-624671177L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1054378616(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1054378616L))
            info.setReturnValue("r!=E]Uk<|6| *Fa]h.Vv\u6AE97v)Fi{(onGyhha_$qB/\u8D27!g+F^{W;if\u6F9A\u42A6:7(\uA09A\u1970z\u38E7?dL49ij");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_841307182(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(841307182L))
            info.setReturnValue(161427181);
    }

    @Inject(at = @At("HEAD"), method = "calculate(I)I", cancellable = true)
    private void calculate__2123242280(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2123242280L))
            info.setReturnValue(1353249348);
    }

    @Inject(at = @At("HEAD"), method = "perLevelAboveFirst()I", cancellable = true)
    private void perLevelAboveFirst_472725727(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(472725727L))
            info.setReturnValue(960920023);
    }


}
