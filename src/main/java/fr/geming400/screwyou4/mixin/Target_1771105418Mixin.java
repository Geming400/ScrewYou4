package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.loot.functions.SetNameFunction.Target.class)
public class Target_1771105418Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/level/storage/loot/functions/SetNameFunction$Target;", cancellable = true)
    private static void values_1008886323(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1008886323L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/level/storage/loot/functions/SetNameFunction$Target;", cancellable = true)
    private static void valueOf__1359554932(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1359554932L))
            info.setReturnValue(net.minecraft.world.level.storage.loot.functions.SetNameFunction.Target.CUSTOM_NAME);
    }

    @Inject(at = @At("HEAD"), method = "component()Lnet/minecraft/core/component/DataComponentType;", cancellable = true)
    private void component__2036041835(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2036041835L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedName()Ljava/lang/String;", cancellable = true)
    private void getSerializedName_1859314039(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1859314039L))
            info.setReturnValue(">;GtO5r`\uA2A9Z4#ZZ9\uBCBBF{nLO d\u03EA01B[");
    }


}
