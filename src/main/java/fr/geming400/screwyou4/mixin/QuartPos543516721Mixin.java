package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.core.QuartPos.class)
public class QuartPos543516721Mixin {
        @Inject(at = @At("HEAD"), method = "quartLocal(I)I", cancellable = true)
    private static void quartLocal_1757421448(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1757421448L))
            info.setReturnValue(716590622);
    }

    @Inject(at = @At("HEAD"), method = "toSection(I)I", cancellable = true)
    private static void toSection_1757421448(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1757421448L))
            info.setReturnValue(716590622);
    }

    @Inject(at = @At("HEAD"), method = "fromSection(I)I", cancellable = true)
    private static void fromSection_1757421448(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1757421448L))
            info.setReturnValue(716590622);
    }

    @Inject(at = @At("HEAD"), method = "fromBlock(I)I", cancellable = true)
    private static void fromBlock_1757421448(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1757421448L))
            info.setReturnValue(716590622);
    }

    @Inject(at = @At("HEAD"), method = "toBlock(I)I", cancellable = true)
    private static void toBlock_1757421448(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1757421448L))
            info.setReturnValue(716590622);
    }


}
