package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.enchantment.effects.DamageImmunity.class)
public class DamageImmunity408285853Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__500340415(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-500340415L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1178709378(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1178709378L))
            info.setReturnValue("ua-_c1/2]w%\u1A36\u6C99hWb+d0[Gx\u49A0GzMw#kMDt}Z>A_\u4648B\u02A8.!^u\u025A%_9\u4A91bMo-w}X)gc588tFuKn8dQm=D\u2F46+-\uA9ECp][??gXYlh\u6A35qs)P\uCF10]6\u1360gQ");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_965637944(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(965637944L))
            info.setReturnValue(384539462);
    }


}
