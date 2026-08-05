package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.nbt.TagTypes.class)
public class TagTypes_1504515183Mixin {
        @Inject(at = @At("HEAD"), method = "getType(I)Lnet/minecraft/nbt/TagType;", cancellable = true)
    private static void getType__102492702(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-102492702L))
            info.setReturnValue(null);
    }


}
